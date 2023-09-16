package com.pearlyadana.rakhapuraapp.service;

import com.pearlyadana.rakhapuraapp.model.request.StudentClassDto;
import com.pearlyadana.rakhapuraapp.model.response.PaginationResponse;

import java.util.List;
import java.util.UUID;

public interface StudentClassService {

    Integer findMaxRegSeqNo(Long examTitleId, Long academicYearId, Long gradeId);

    StudentClassDto findById(UUID id);

    List<StudentClassDto> findAllByStudentId(UUID id);

    List<StudentClassDto> findAll();

    List<StudentClassDto> findAllByExamTitleAndAcademicYearAndStudent(Long examTitleId, Long academicYearId, UUID studentId);

    List<StudentClassDto> findAllBySearching(Long examTitleId, Long academicYearId, Long gradeId, String studentClass, String keyword);

    PaginationResponse<StudentClassDto> findEachPageBySearchingSortByCreatedTimestamp(int pageNumber, boolean isAscending, Long examTitleId, Long academicYearId, Long gradeId, String studentClass, String keyword);

    StudentClassDto save(StudentClassDto studentClassDto);

    StudentClassDto update(StudentClassDto studentClassDto, UUID id);

    void deleteById(UUID id);

}
