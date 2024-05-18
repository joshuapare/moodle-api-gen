# ModFeedbackGetNonRespondents200ResponseUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course id | [optional] 
**fullname** | **str** | User full name | [optional] 
**started** | **bool** | If the user has started the attempt | [optional] [default to False]
**userid** | **int** | The user id | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_get_non_respondents200_response_users_inner import ModFeedbackGetNonRespondents200ResponseUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetNonRespondents200ResponseUsersInner from a JSON string
mod_feedback_get_non_respondents200_response_users_inner_instance = ModFeedbackGetNonRespondents200ResponseUsersInner.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetNonRespondents200ResponseUsersInner.to_json())

# convert the object into a dict
mod_feedback_get_non_respondents200_response_users_inner_dict = mod_feedback_get_non_respondents200_response_users_inner_instance.to_dict()
# create an instance of ModFeedbackGetNonRespondents200ResponseUsersInner from a dict
mod_feedback_get_non_respondents200_response_users_inner_from_dict = ModFeedbackGetNonRespondents200ResponseUsersInner.from_dict(mod_feedback_get_non_respondents200_response_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


