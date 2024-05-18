# CoreEnrolGetEnrolledUsersRequestOptionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | option name | [optional] [default to 'null']
**value** | **str** | option value | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_enrol_get_enrolled_users_request_options_inner import CoreEnrolGetEnrolledUsersRequestOptionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreEnrolGetEnrolledUsersRequestOptionsInner from a JSON string
core_enrol_get_enrolled_users_request_options_inner_instance = CoreEnrolGetEnrolledUsersRequestOptionsInner.from_json(json)
# print the JSON string representation of the object
print(CoreEnrolGetEnrolledUsersRequestOptionsInner.to_json())

# convert the object into a dict
core_enrol_get_enrolled_users_request_options_inner_dict = core_enrol_get_enrolled_users_request_options_inner_instance.to_dict()
# create an instance of CoreEnrolGetEnrolledUsersRequestOptionsInner from a dict
core_enrol_get_enrolled_users_request_options_inner_from_dict = CoreEnrolGetEnrolledUsersRequestOptionsInner.from_dict(core_enrol_get_enrolled_users_request_options_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


