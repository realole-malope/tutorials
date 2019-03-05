package za.co.malope.security.secureapp.service;

import za.co.malope.security.secureapp.entity.User;

public interface UserService extends BaseService {

    User findUserByReferenceId(String referenceId);
}
