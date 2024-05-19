# ModLtiGetToolProxyRegistrationRequest200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launch_presentation_return_url** | **str** | URL to redirect on registration completion | [default to 'null']
**lti_message_type** | **str** | LTI message type | [default to 'null']
**lti_version** | **str** | LTI version | [default to 'null']
**reg_key** | **str** | Tool proxy registration key | [default to 'null']
**reg_password** | **str** | Tool proxy registration password | [default to 'null']
**reg_url** | **str** | Tool proxy registration url | [default to 'null']
**tc_profile_url** | **str** | Tool consumers profile URL | [default to 'null']

## Example

```python
from openapi_client.models.mod_lti_get_tool_proxy_registration_request200_response import ModLtiGetToolProxyRegistrationRequest200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiGetToolProxyRegistrationRequest200Response from a JSON string
mod_lti_get_tool_proxy_registration_request200_response_instance = ModLtiGetToolProxyRegistrationRequest200Response.from_json(json)
# print the JSON string representation of the object
print(ModLtiGetToolProxyRegistrationRequest200Response.to_json())

# convert the object into a dict
mod_lti_get_tool_proxy_registration_request200_response_dict = mod_lti_get_tool_proxy_registration_request200_response_instance.to_dict()
# create an instance of ModLtiGetToolProxyRegistrationRequest200Response from a dict
mod_lti_get_tool_proxy_registration_request200_response_from_dict = ModLtiGetToolProxyRegistrationRequest200Response.from_dict(mod_lti_get_tool_proxy_registration_request200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


