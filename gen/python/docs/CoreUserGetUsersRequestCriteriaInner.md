# CoreUserGetUsersRequestCriteriaInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | the user column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching user id,                                 \&quot;lastname\&quot; (string) user last name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;firstname\&quot; (string) user first name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;idnumber\&quot; (string) matching user idnumber,                                 \&quot;username\&quot; (string) matching user username,                                 \&quot;email\&quot; (string) user email (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;auth\&quot; (string) matching user auth plugin | [optional] [default to 'null']
**value** | **str** | the value to search | [optional] 

## Example

```python
from openapi_client.models.core_user_get_users_request_criteria_inner import CoreUserGetUsersRequestCriteriaInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserGetUsersRequestCriteriaInner from a JSON string
core_user_get_users_request_criteria_inner_instance = CoreUserGetUsersRequestCriteriaInner.from_json(json)
# print the JSON string representation of the object
print(CoreUserGetUsersRequestCriteriaInner.to_json())

# convert the object into a dict
core_user_get_users_request_criteria_inner_dict = core_user_get_users_request_criteria_inner_instance.to_dict()
# create an instance of CoreUserGetUsersRequestCriteriaInner from a dict
core_user_get_users_request_criteria_inner_from_dict = CoreUserGetUsersRequestCriteriaInner.from_dict(core_user_get_users_request_criteria_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


