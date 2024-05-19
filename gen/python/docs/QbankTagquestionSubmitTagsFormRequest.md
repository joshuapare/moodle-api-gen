# QbankTagquestionSubmitTagsFormRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The editing context id | 
**formdata** | **str** | The data from the tag form | 
**questionid** | **int** | The question id | 

## Example

```python
from openapi_client.models.qbank_tagquestion_submit_tags_form_request import QbankTagquestionSubmitTagsFormRequest

# TODO update the JSON string below
json = "{}"
# create an instance of QbankTagquestionSubmitTagsFormRequest from a JSON string
qbank_tagquestion_submit_tags_form_request_instance = QbankTagquestionSubmitTagsFormRequest.from_json(json)
# print the JSON string representation of the object
print(QbankTagquestionSubmitTagsFormRequest.to_json())

# convert the object into a dict
qbank_tagquestion_submit_tags_form_request_dict = qbank_tagquestion_submit_tags_form_request_instance.to_dict()
# create an instance of QbankTagquestionSubmitTagsFormRequest from a dict
qbank_tagquestion_submit_tags_form_request_from_dict = QbankTagquestionSubmitTagsFormRequest.from_dict(qbank_tagquestion_submit_tags_form_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


