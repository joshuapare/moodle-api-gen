# ModLtiCreateToolType200ResponseUrls


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accesstoken** | **str** | Access Token URL | [default to 'null']
**authrequest** | **str** | Authorisation Request URL | [default to 'null']
**course** | **str** | Tool type edit URL | [optional] [default to 'null']
**edit** | **str** | Tool type edit URL | 
**icon** | **str** | Tool type icon URL | [default to 'null']
**publickeyset** | **str** | Public Keyset URL | [default to 'null']

## Example

```python
from openapi_client.models.mod_lti_create_tool_type200_response_urls import ModLtiCreateToolType200ResponseUrls

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiCreateToolType200ResponseUrls from a JSON string
mod_lti_create_tool_type200_response_urls_instance = ModLtiCreateToolType200ResponseUrls.from_json(json)
# print the JSON string representation of the object
print(ModLtiCreateToolType200ResponseUrls.to_json())

# convert the object into a dict
mod_lti_create_tool_type200_response_urls_dict = mod_lti_create_tool_type200_response_urls_instance.to_dict()
# create an instance of ModLtiCreateToolType200ResponseUrls from a dict
mod_lti_create_tool_type200_response_urls_from_dict = ModLtiCreateToolType200ResponseUrls.from_dict(mod_lti_create_tool_type200_response_urls_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


