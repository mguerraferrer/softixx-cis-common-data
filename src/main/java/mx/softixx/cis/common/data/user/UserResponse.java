package mx.softixx.cis.common.data.user;

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
public class UserResponse {
	private Long id;
	private String email;
	private String firstName;
	private String lastName;
	private String fullName;
	private String photo;
	private String hash;
	private boolean blockedAccess;
	private boolean active;
	private List<RoleResponse> roles;
}