# ModIomadcertificateGetIomadcertificatesByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iomadcertificates** | [**List[ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner]**](ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_iomadcertificate_get_iomadcertificates_by_courses200_response import ModIomadcertificateGetIomadcertificatesByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModIomadcertificateGetIomadcertificatesByCourses200Response from a JSON string
mod_iomadcertificate_get_iomadcertificates_by_courses200_response_instance = ModIomadcertificateGetIomadcertificatesByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModIomadcertificateGetIomadcertificatesByCourses200Response.to_json())

# convert the object into a dict
mod_iomadcertificate_get_iomadcertificates_by_courses200_response_dict = mod_iomadcertificate_get_iomadcertificates_by_courses200_response_instance.to_dict()
# create an instance of ModIomadcertificateGetIomadcertificatesByCourses200Response from a dict
mod_iomadcertificate_get_iomadcertificates_by_courses200_response_from_dict = ModIomadcertificateGetIomadcertificatesByCourses200Response.from_dict(mod_iomadcertificate_get_iomadcertificates_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


