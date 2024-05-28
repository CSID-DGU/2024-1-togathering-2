package togathering.Plogging.service;

import org.springframework.web.multipart.MultipartFile;
import togathering.Plogging.app.dto.PloggingCourseDTO;
import togathering.Plogging.app.dto.PloggingGroupReviewDTO;
import togathering.Plogging.domain.PloggingCourse;
import togathering.Plogging.domain.mapping.PloggingGroupReview;

import java.io.IOException;
import java.util.List;

public interface PCsQueryService {
    List<PloggingCourseDTO.GetPloggingCourseInfoDTO> getCoursesList();
    PloggingCourseDTO.ResponsePloggingCourseDTO createPloggingCourse(PloggingCourseDTO.RequestPloggingCourseDTO request);
    PloggingGroupReviewDTO.ResponsePloggingGroupReviewDTO createPloggingGroupReivew(PloggingGroupReviewDTO.RequestPloggingGroupReviewDTO request) throws IOException;
    PloggingGroupReview getReview(Long review_id);

    PloggingCourseDTO.ResponseModifyCourseTagDTO modifyCourseTag(PloggingCourseDTO.RequestModifyCourseTagDTO request, Long id);

    PloggingCourseDTO.GetPloggingCourseInfoDTO getCourseInfo(Long course_id);

    PloggingCourseDTO.ResponsePloggingCourseDTO modifyCourse(PloggingCourseDTO.RequestPloggingCourseDTO request, Long id);
    List<PloggingCourseDTO.ResponsePloggingCourseDTO> getRecommendCourseListByAI(PloggingCourseDTO.RequestRecommendCourseDTO dto);
    List<PloggingCourseDTO.ResponsePloggingCourseDTO> getCourseListSearchBy(String word);
}
