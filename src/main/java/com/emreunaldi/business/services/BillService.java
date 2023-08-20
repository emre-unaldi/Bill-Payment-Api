package com.emreunaldi.business.services;



import com.emreunaldi.business.requests.BillRequest;
import com.emreunaldi.business.responses.BillResponse;
import com.emreunaldi.utilities.results.DataResult;
import com.emreunaldi.utilities.results.Result;

import java.util.List;

public interface BillService {
    DataResult<BillRequest> add(BillRequest billRequest);
    DataResult<BillRequest> update(BillRequest billRequest);
    Result delete(Integer id);
    DataResult<List<BillResponse>> getAll();
    DataResult<BillResponse> getById(Integer id);
    DataResult<BillResponse> getByCode(Integer id);
    DataResult<BillResponse> payBill(Integer id);
    DataResult<BillResponse> cancelBill(Integer id);
}
