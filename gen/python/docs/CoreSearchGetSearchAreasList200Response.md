# CoreSearchGetSearchAreasList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**areas** | [**List[CoreSearchGetSearchAreasList200ResponseAreasInner]**](CoreSearchGetSearchAreasList200ResponseAreasInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_search_get_search_areas_list200_response import CoreSearchGetSearchAreasList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSearchGetSearchAreasList200Response from a JSON string
core_search_get_search_areas_list200_response_instance = CoreSearchGetSearchAreasList200Response.from_json(json)
# print the JSON string representation of the object
print(CoreSearchGetSearchAreasList200Response.to_json())

# convert the object into a dict
core_search_get_search_areas_list200_response_dict = core_search_get_search_areas_list200_response_instance.to_dict()
# create an instance of CoreSearchGetSearchAreasList200Response from a dict
core_search_get_search_areas_list200_response_from_dict = CoreSearchGetSearchAreasList200Response.from_dict(core_search_get_search_areas_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


