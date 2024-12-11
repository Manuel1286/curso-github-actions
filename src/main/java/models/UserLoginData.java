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
  DocumentType documentType;
  String documentNumber;
  String password;
  String typeAccount;
  String infoAccount;
  String lastFourOfCard;
}
