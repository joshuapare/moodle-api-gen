# ModQuizGetQuizAccessInformation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessrules** | **List[object]** |  | 
**activerulenames** | **List[object]** |  | 
**canattempt** | **bool** | Whether the user can do the quiz or not. | [default to False]
**canmanage** | **bool** | Whether the user can edit the quiz settings or not. | [default to False]
**canpreview** | **bool** | Whether the user can preview the quiz or not. | [default to False]
**canreviewmyattempts** | **bool** | Whether the users can review their previous attempts                                                                 or not. | [default to False]
**canviewreports** | **bool** | Whether the user can view the quiz reports or not. | [default to False]
**preventaccessreasons** | **List[object]** |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_get_quiz_access_information200_response import ModQuizGetQuizAccessInformation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetQuizAccessInformation200Response from a JSON string
mod_quiz_get_quiz_access_information200_response_instance = ModQuizGetQuizAccessInformation200Response.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetQuizAccessInformation200Response.to_json())

# convert the object into a dict
mod_quiz_get_quiz_access_information200_response_dict = mod_quiz_get_quiz_access_information200_response_instance.to_dict()
# create an instance of ModQuizGetQuizAccessInformation200Response from a dict
mod_quiz_get_quiz_access_information200_response_from_dict = ModQuizGetQuizAccessInformation200Response.from_dict(mod_quiz_get_quiz_access_information200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


