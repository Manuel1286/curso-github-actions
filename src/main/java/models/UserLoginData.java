package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginData {
  private DocumentType documentType;
  private String documentNumber;
  private String password;
  private String typeAccount;
  private String infoAccount;
  private String lastFourOfCard;
}
