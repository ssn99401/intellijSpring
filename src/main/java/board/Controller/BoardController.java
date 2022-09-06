package board.Controller;

import board.Service.BoardService;
import board.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class BoardController {
    final BoardService boardService;

    @RequestMapping()
    public String getBoardListView(){
        return "";
    }

    @RequestMapping()
    public ResponseEntity<List<BoardVO>> getBoardList(){
        return new ResponseEntity<> (boardService.getBoardList(), HttpStatus.OK);
    }
}
