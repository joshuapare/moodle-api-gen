# CoreUserGetUsersByFieldRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_field** | **str** | the search field can be                     &#39;id&#39; or &#39;idnumber&#39; or &#39;username&#39; or &#39;email&#39; | [default to 'null']
**values** | **List[object]** |  | 

## Example

```python
from openapi_client.models.core_user_get_users_by_field_request import CoreUserGetUsersByFieldRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserGetUsersByFieldRequest from a JSON string
core_user_get_users_by_field_request_instance = CoreUserGetUsersByFieldRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserGetUsersByFieldRequest.to_json())

# convert the object into a dict
core_user_get_users_by_field_request_dict = core_user_get_users_by_field_request_instance.to_dict()
# create an instance of CoreUserGetUsersByFieldRequest from a dict
core_user_get_users_by_field_request_from_dict = CoreUserGetUsersByFieldRequest.from_dict(core_user_get_users_by_field_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


