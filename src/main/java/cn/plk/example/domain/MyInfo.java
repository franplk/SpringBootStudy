/**
 * 
 */
package cn.plk.example.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author {康培亮/AB052634}
 *
 */
@Component
@ConfigurationProperties(prefix = "my")
public class MyInfo extends BaseDomain {

	private static final long serialVersionUID = 1L;

	private String name;
	private String career;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}
}
