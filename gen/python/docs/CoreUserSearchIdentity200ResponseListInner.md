# CoreUserSearchIdentity200ResponseListInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**extrafields** | [**List[CoreUserSearchIdentity200ResponseListInnerExtrafieldsInner]**](CoreUserSearchIdentity200ResponseListInnerExtrafieldsInner.md) |  | [optional] 
**fullname** | **str** | The fullname of the user | [optional] 
**id** | **int** | ID of the user | [optional] 

## Example

```python
from openapi_client.models.core_user_search_identity200_response_list_inner import CoreUserSearchIdentity200ResponseListInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserSearchIdentity200ResponseListInner from a JSON string
core_user_search_identity200_response_list_inner_instance = CoreUserSearchIdentity200ResponseListInner.from_json(json)
# print the JSON string representation of the object
print(CoreUserSearchIdentity200ResponseListInner.to_json())

# convert the object into a dict
core_user_search_identity200_response_list_inner_dict = core_user_search_identity200_response_list_inner_instance.to_dict()
# create an instance of CoreUserSearchIdentity200ResponseListInner from a dict
core_user_search_identity200_response_list_inner_from_dict = CoreUserSearchIdentity200ResponseListInner.from_dict(core_user_search_identity200_response_list_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


