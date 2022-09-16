package zz.yk.app.domain.po;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class UserPO implements Serializable {

    private Integer id;

    private String userName;

    private String password;

    private String status;

}
