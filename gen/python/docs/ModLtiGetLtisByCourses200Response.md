# ModLtiGetLtisByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ltis** | [**List[ModLtiGetLtisByCourses200ResponseLtisInner]**](ModLtiGetLtisByCourses200ResponseLtisInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lti_get_ltis_by_courses200_response import ModLtiGetLtisByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiGetLtisByCourses200Response from a JSON string
mod_lti_get_ltis_by_courses200_response_instance = ModLtiGetLtisByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModLtiGetLtisByCourses200Response.to_json())

# convert the object into a dict
mod_lti_get_ltis_by_courses200_response_dict = mod_lti_get_ltis_by_courses200_response_instance.to_dict()
# create an instance of ModLtiGetLtisByCourses200Response from a dict
mod_lti_get_ltis_by_courses200_response_from_dict = ModLtiGetLtisByCourses200Response.from_dict(mod_lti_get_ltis_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


