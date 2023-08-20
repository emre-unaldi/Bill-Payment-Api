package com.emreunaldi.business.services;

import com.emreunaldi.business.requests.MemberAccountRequest;
import com.emreunaldi.business.responses.MemberAccountResponse;
import com.emreunaldi.utilities.results.DataResult;
import com.emreunaldi.utilities.results.Result;

import java.util.List;

public interface MemberAccountService {
    DataResult<MemberAccountRequest> add(MemberAccountRequest memberAccountRequest);
    DataResult<MemberAccountRequest> update(MemberAccountRequest memberAccountRequest);
    Result delete(Integer id);
    DataResult<List<MemberAccountResponse>> getAll();
    DataResult<MemberAccountResponse> getById(Integer id);

}
