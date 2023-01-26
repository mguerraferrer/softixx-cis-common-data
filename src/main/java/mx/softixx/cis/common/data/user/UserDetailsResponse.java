package mx.softixx.cis.common.data.user;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.softixx.cis.common.data.role.RoleResponse;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsResponse {
	private Long id;
	private String email;
	private String firstName;
	private String lastName;
	private String fullName;
	private String photo;
	private String password;
	private String hash;
	private LocalDateTime creationDate;
	private LocalDateTime activationDate;
	private LocalDateTime lastAccess;
	private boolean firstVisit;
	private boolean initialConfigCompleted;
	private boolean forcePasswdChange;
	private String activationCode;
	private LocalDateTime activationCodeDuedate;
	private String changePasswdCode;
	private LocalDateTime changePasswdCodeDuedate;
	private Integer failedAttempts;
	private boolean blockedAccess;
	private boolean active;
	private List<RoleResponse> roles;
}