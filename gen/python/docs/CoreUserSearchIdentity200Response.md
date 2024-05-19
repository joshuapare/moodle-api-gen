# CoreUserSearchIdentity200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**list** | [**List[CoreUserSearchIdentity200ResponseListInner]**](CoreUserSearchIdentity200ResponseListInner.md) |  | 
**maxusersperpage** | **int** | Configured maximum users per page. | [default to null]
**overflow** | **bool** | Were there more records than maxusersperpage found? | [default to False]

## Example

```python
from openapi_client.models.core_user_search_identity200_response import CoreUserSearchIdentity200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserSearchIdentity200Response from a JSON string
core_user_search_identity200_response_instance = CoreUserSearchIdentity200Response.from_json(json)
# print the JSON string representation of the object
print(CoreUserSearchIdentity200Response.to_json())

# convert the object into a dict
core_user_search_identity200_response_dict = core_user_search_identity200_response_instance.to_dict()
# create an instance of CoreUserSearchIdentity200Response from a dict
core_user_search_identity200_response_from_dict = CoreUserSearchIdentity200Response.from_dict(core_user_search_identity200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


