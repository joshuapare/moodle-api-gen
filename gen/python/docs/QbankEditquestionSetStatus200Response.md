# QbankEditquestionSetStatus200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **str** | Error message if error exists | [default to 'null']
**status** | **bool** | status: true if success | 
**statusname** | **str** | statusname: name of the status | [default to 'null']

## Example

```python
from openapi_client.models.qbank_editquestion_set_status200_response import QbankEditquestionSetStatus200Response

# TODO update the JSON string below
json = "{}"
# create an instance of QbankEditquestionSetStatus200Response from a JSON string
qbank_editquestion_set_status200_response_instance = QbankEditquestionSetStatus200Response.from_json(json)
# print the JSON string representation of the object
print(QbankEditquestionSetStatus200Response.to_json())

# convert the object into a dict
qbank_editquestion_set_status200_response_dict = qbank_editquestion_set_status200_response_instance.to_dict()
# create an instance of QbankEditquestionSetStatus200Response from a dict
qbank_editquestion_set_status200_response_from_dict = QbankEditquestionSetStatus200Response.from_dict(qbank_editquestion_set_status200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


