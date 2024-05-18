# ModQuizGetQuizAccessInformationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quizid** | **int** | quiz instance id | 

## Example

```python
from openapi_client.models.mod_quiz_get_quiz_access_information_request import ModQuizGetQuizAccessInformationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetQuizAccessInformationRequest from a JSON string
mod_quiz_get_quiz_access_information_request_instance = ModQuizGetQuizAccessInformationRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetQuizAccessInformationRequest.to_json())

# convert the object into a dict
mod_quiz_get_quiz_access_information_request_dict = mod_quiz_get_quiz_access_information_request_instance.to_dict()
# create an instance of ModQuizGetQuizAccessInformationRequest from a dict
mod_quiz_get_quiz_access_information_request_from_dict = ModQuizGetQuizAccessInformationRequest.from_dict(mod_quiz_get_quiz_access_information_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


