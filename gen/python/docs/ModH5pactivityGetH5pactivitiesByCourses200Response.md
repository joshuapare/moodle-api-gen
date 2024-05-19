# ModH5pactivityGetH5pactivitiesByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**h5pactivities** | [**List[ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner]**](ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.md) |  | 
**h5pglobalsettings** | [**ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings**](ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings.md) |  | [optional] 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_h5pactivity_get_h5pactivities_by_courses200_response import ModH5pactivityGetH5pactivitiesByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModH5pactivityGetH5pactivitiesByCourses200Response from a JSON string
mod_h5pactivity_get_h5pactivities_by_courses200_response_instance = ModH5pactivityGetH5pactivitiesByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModH5pactivityGetH5pactivitiesByCourses200Response.to_json())

# convert the object into a dict
mod_h5pactivity_get_h5pactivities_by_courses200_response_dict = mod_h5pactivity_get_h5pactivities_by_courses200_response_instance.to_dict()
# create an instance of ModH5pactivityGetH5pactivitiesByCourses200Response from a dict
mod_h5pactivity_get_h5pactivities_by_courses200_response_from_dict = ModH5pactivityGetH5pactivitiesByCourses200Response.from_dict(mod_h5pactivity_get_h5pactivities_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


