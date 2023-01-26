package mx.softixx.cis.common.data.role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleResponse {
	private Long id;
	private String code;
	private String name;
	private String valueMx;
	private String valueUs;
	private boolean visible;
	private boolean active;
}