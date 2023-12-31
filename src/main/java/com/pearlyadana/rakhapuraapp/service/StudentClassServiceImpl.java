package com.pearlyadana.rakhapuraapp.service;

import com.pearlyadana.rakhapuraapp.entity.StudentClass;
import com.pearlyadana.rakhapuraapp.mapper.StudentClassMapper;
import com.pearlyadana.rakhapuraapp.model.request.StudentClassDto;
import com.pearlyadana.rakhapuraapp.model.response.PaginationResponse;
import com.pearlyadana.rakhapuraapp.repository.StudentClassRepository;
import com.pearlyadana.rakhapuraapp.util.PaginationUtil;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class StudentClassServiceImpl implements StudentClassService {

    @Autowired
    private StudentClassRepository studentClassRepository;

    @Autowired
    private PaginationUtil paginationUtil;

    private final StudentClassMapper mapper = Mappers.getMapper(StudentClassMapper.class);

    @Transactional(readOnly = true)
    @Override
    public Integer findMaxRegSeqNo(Long examTitleId, Long academicYearId, Long gradeId) {
        Integer maxRegSeqNo = this.studentClassRepository.findMaxRegSeqNo(examTitleId, academicYearId, gradeId);
        if(maxRegSeqNo == null) {
            maxRegSeqNo = 0;
        }
        return maxRegSeqNo;
    }

    @Transactional(readOnly = true)
    @Override
    public StudentClassDto findById(UUID id) {
        Optional<StudentClass> optional = this.studentClassRepository.findById(id);
        return optional.map(this.mapper::mapEntityToDto).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public List<StudentClassDto> findAllByStudentId(UUID id) {
        return this.studentClassRepository.findAllByStudentId(id)
                .stream()
                .map(this.mapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    @Override
    public List<StudentClassDto> findAll() {
        return this.studentClassRepository.findAll()
                .stream()
                .map(this.mapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    @Override
    public List<StudentClassDto> findAllByExamTitleAndAcademicYearAndStudent(Long examTitleId, Long academicYearId, UUID studentId) {
        return this.studentClassRepository.findAllByExamTitleIdAndAcademicYearIdAndStudentId(examTitleId, academicYearId, studentId)
                .stream()
                .map(this.mapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    @Override
    public List<StudentClassDto> findAllBySearching(Long examTitleId, Long academicYearId, Long gradeId, String studentClass, String keyword) {
        List<StudentClass> studentClassList;
        if(examTitleId == 0 && academicYearId == 0 && gradeId == 0 && studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByKeyword(keyword);
        } else if(examTitleId != 0 && academicYearId == 0 && gradeId == 0 && studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByExamTitleAndKeyword(examTitleId, keyword);
        } else if(examTitleId == 0 && academicYearId != 0 && gradeId == 0 && studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByAcademicYearAndKeyword(academicYearId, keyword);
        } else if(examTitleId == 0 && academicYearId == 0 && gradeId != 0 && studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByGradeAndKeyword(gradeId, keyword);
        } else if(examTitleId == 0 && academicYearId == 0 && gradeId == 0 && !studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByClassAndKeyword(studentClass, keyword);
        } else if(examTitleId != 0 && academicYearId != 0 && gradeId == 0 && studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByExamTitleAndAcademicYearAndKeyword(examTitleId, academicYearId, keyword);
        } else if(examTitleId != 0 && academicYearId == 0 && gradeId != 0 && studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByExamTitleAndGradeAndKeyword(examTitleId, gradeId, keyword);
        } else if(examTitleId != 0 && academicYearId == 0 && gradeId == 0 && !studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByExamTitleAndClassAndKeyword(examTitleId, studentClass, keyword);
        } else if(examTitleId == 0 && academicYearId != 0 && gradeId != 0 && studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByAcademicYearAndGradeAndKeyword(academicYearId, gradeId, keyword);
        } else if(examTitleId == 0 && academicYearId != 0 && gradeId == 0 && !studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByAcademicYearAndClassAndKeyword(academicYearId, studentClass, keyword);
        } else if(examTitleId == 0 && academicYearId == 0 && gradeId != 0 && !studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByGradeAndClassAndKeyword(gradeId, studentClass, keyword);
        } else if(examTitleId != 0 && academicYearId != 0 && gradeId != 0 && studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByExamTitleAndAcademicYearAndGradeAndKeyword(examTitleId, academicYearId, gradeId, keyword);
        } else if(examTitleId != 0 && academicYearId != 0 && gradeId == 0 && !studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByExamTitleAndAcademicYearAndClassAndKeyword(examTitleId, academicYearId, studentClass, keyword);
        } else if(examTitleId != 0 && academicYearId == 0 && gradeId != 0 && !studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByExamTitleAndGradeAndClassAndKeyword(examTitleId, gradeId, studentClass, keyword);
        } else if(examTitleId == 0 && academicYearId != 0 && gradeId != 0 && !studentClass.equals("All")) {
            studentClassList = this.studentClassRepository.findAllByAcademicYearAndGradeAndClassAndKeyword(academicYearId, gradeId, studentClass, keyword);
        } else {
            studentClassList = this.studentClassRepository.findAllByExamTitleAndAcademicYearAndGradeAndClassAndKeyword(examTitleId, academicYearId, gradeId, studentClass, keyword);
        }
        return studentClassList
                .stream()
                .map(this.mapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    @Override
    public PaginationResponse<StudentClassDto> findEachPageBySearchingSortByCreatedTimestamp(int pageNumber, boolean isAscending, Long examTitleId, Long academicYearId, Long gradeId, String studentClass, String keyword) {
        Pageable sortedByCreatedTimestamp;
        if(isAscending) {
            sortedByCreatedTimestamp = PageRequest.of(PaginationUtil.pageNumber(pageNumber),
                    paginationUtil.getPageSize(), Sort.by("created_timestamp").ascending());
        } else {
            sortedByCreatedTimestamp = PageRequest.of(PaginationUtil.pageNumber(pageNumber),
                    paginationUtil.getPageSize(), Sort.by("created_timestamp").descending());
        }
        Page<StudentClass> page;
        if(examTitleId == 0 && academicYearId == 0 && gradeId == 0 && studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByKeyword(keyword, sortedByCreatedTimestamp);
        } else if(examTitleId != 0 && academicYearId == 0 && gradeId == 0 && studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByExamTitleAndKeyword(examTitleId, keyword, sortedByCreatedTimestamp);
        } else if(examTitleId == 0 && academicYearId != 0 && gradeId == 0 && studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByAcademicYearAndKeyword(academicYearId, keyword, sortedByCreatedTimestamp);
        } else if(examTitleId == 0 && academicYearId == 0 && gradeId != 0 && studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByGradeAndKeyword(gradeId, keyword, sortedByCreatedTimestamp);
        } else if(examTitleId == 0 && academicYearId == 0 && gradeId == 0 && !studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByClassAndKeyword(studentClass, keyword, sortedByCreatedTimestamp);
        } else if(examTitleId != 0 && academicYearId != 0 && gradeId == 0 && studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByExamTitleAndAcademicYearAndKeyword(examTitleId, academicYearId, keyword, sortedByCreatedTimestamp);
        } else if(examTitleId != 0 && academicYearId == 0 && gradeId != 0 && studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByExamTitleAndGradeAndKeyword(examTitleId, gradeId, keyword, sortedByCreatedTimestamp);
        } else if(examTitleId != 0 && academicYearId == 0 && gradeId == 0 && !studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByExamTitleAndClassAndKeyword(examTitleId, studentClass, keyword, sortedByCreatedTimestamp);
        } else if(examTitleId == 0 && academicYearId != 0 && gradeId != 0 && studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByAcademicYearAndGradeAndKeyword(academicYearId, gradeId, keyword, sortedByCreatedTimestamp);
        } else if(examTitleId == 0 && academicYearId != 0 && gradeId == 0 && !studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByAcademicYearAndClassAndKeyword(academicYearId, studentClass, keyword, sortedByCreatedTimestamp);
        } else if(examTitleId == 0 && academicYearId == 0 && gradeId != 0 && !studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByGradeAndClassAndKeyword(gradeId, studentClass, keyword, sortedByCreatedTimestamp);
        } else if(examTitleId != 0 && academicYearId != 0 && gradeId != 0 && studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByExamTitleAndAcademicYearAndGradeAndKeyword(examTitleId, academicYearId, gradeId, keyword, sortedByCreatedTimestamp);
        } else if(examTitleId != 0 && academicYearId != 0 && gradeId == 0 && !studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByExamTitleAndAcademicYearAndClassAndKeyword(examTitleId, academicYearId, studentClass, keyword, sortedByCreatedTimestamp);
        } else if(examTitleId != 0 && academicYearId == 0 && gradeId != 0 && !studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByExamTitleAndGradeAndClassAndKeyword(examTitleId, gradeId, studentClass, keyword, sortedByCreatedTimestamp);
        } else if(examTitleId == 0 && academicYearId != 0 && gradeId != 0 && !studentClass.equals("All")) {
            page = this.studentClassRepository.findAllByAcademicYearAndGradeAndClassAndKeyword(academicYearId, gradeId, studentClass, keyword, sortedByCreatedTimestamp);
        } else {
            page = this.studentClassRepository.findAllByExamTitleAndAcademicYearAndGradeAndClassAndKeyword(examTitleId, academicYearId, gradeId, studentClass, keyword, sortedByCreatedTimestamp);
        }

        PaginationResponse<StudentClassDto> res = new PaginationResponse<StudentClassDto>();
        res.addList(page.stream().map(this.mapper::mapEntityToDto).collect(Collectors.toList()))
                .addTotalElements(page.getTotalElements())
                .addTotalPages(page.getTotalPages())
                .addPageSize(page.getSize());
        return res;
    }

    @Transactional
    @Override
    public StudentClassDto save(StudentClassDto studentClassDto) {
        return this.mapper.mapEntityToDto(this.studentClassRepository.save(this.mapper.mapDtoToEntity(studentClassDto)));
    }

    @Transactional
    @Override
    public StudentClassDto update(StudentClassDto studentClassDto, UUID id) {
        studentClassDto.setId(id);
        return this.mapper.mapEntityToDto(this.studentClassRepository.save(this.mapper.mapDtoToEntity(studentClassDto)));
    }

    @Transactional
    @Override
    public void deleteById(UUID id) {
        this.studentClassRepository.deleteById(id);
    }

}
