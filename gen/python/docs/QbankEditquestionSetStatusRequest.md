# QbankEditquestionSetStatusRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**questionid** | **int** | The question id | 
**status** | **str** | The updated question status | [default to 'null']

## Example

```python
from openapi_client.models.qbank_editquestion_set_status_request import QbankEditquestionSetStatusRequest

# TODO update the JSON string below
json = "{}"
# create an instance of QbankEditquestionSetStatusRequest from a JSON string
qbank_editquestion_set_status_request_instance = QbankEditquestionSetStatusRequest.from_json(json)
# print the JSON string representation of the object
print(QbankEditquestionSetStatusRequest.to_json())

# convert the object into a dict
qbank_editquestion_set_status_request_dict = qbank_editquestion_set_status_request_instance.to_dict()
# create an instance of QbankEditquestionSetStatusRequest from a dict
qbank_editquestion_set_status_request_from_dict = QbankEditquestionSetStatusRequest.from_dict(qbank_editquestion_set_status_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


