# CoreUserSearchIdentityRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **str** | The search query | [default to 'null']

## Example

```python
from openapi_client.models.core_user_search_identity_request import CoreUserSearchIdentityRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserSearchIdentityRequest from a JSON string
core_user_search_identity_request_instance = CoreUserSearchIdentityRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserSearchIdentityRequest.to_json())

# convert the object into a dict
core_user_search_identity_request_dict = core_user_search_identity_request_instance.to_dict()
# create an instance of CoreUserSearchIdentityRequest from a dict
core_user_search_identity_request_from_dict = CoreUserSearchIdentityRequest.from_dict(core_user_search_identity_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


