# ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner

Tool

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bordercolor** | **str** | Border color | [optional] [default to 'null']
**borderstyle** | **str** | Border style | [optional] [default to 'null']
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**customtext** | **str** | Custom text | [optional] [default to 'null']
**datefmt** | **int** | Date format | [optional] [default to null]
**delivery** | **int** | Delivery options | [optional] [default to null]
**emailothers** | **str** | Email others? | [optional] [default to 'null']
**emailteachers** | **int** | Email teachers? | [optional] [default to null]
**gradefmt** | **int** | Grade format | [optional] [default to null]
**groupingid** | **int** | group id | [optional] 
**groupmode** | **int** | group mode | [optional] [default to null]
**id** | **int** | Certificate id | [optional] [default to null]
**intro** | **str** | The Certificate intro | [optional] [default to 'null']
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**iomadcertificatetype** | **str** | Type | [optional] [default to 'null']
**name** | **str** | Certificate name | [optional] [default to 'null']
**orientation** | **str** | Orientation | [optional] [default to 'null']
**printdate** | **str** | Print date? | [optional] [default to 'null']
**printgrade** | **int** | Print grade? | [optional] [default to null]
**printhours** | **str** | Print hours? | [optional] [default to 'null']
**printnumber** | **int** | Print number? | [optional] [default to null]
**printoutcome** | **int** | Print outcome? | [optional] [default to null]
**printseal** | **str** | Print seal? | [optional] [default to 'null']
**printsignature** | **str** | Print signature? | [optional] [default to 'null']
**printteacher** | **int** | Print teacher? | [optional] [default to null]
**printwmark** | **str** | Print water mark? | [optional] [default to 'null']
**reportcert** | **int** | Report iomadcertificate? | [optional] [default to null]
**requiredtime** | **int** | Required time | [optional] [default to null]
**requiredtimenotmet** | **int** | Whether the time req is met | [optional] [default to null]
**savecert** | **int** | Save iomadcertificate? | [optional] [default to null]
**section** | **int** | course section id | [optional] 
**timecreated** | **int** | Time created | [optional] 
**timemodified** | **int** | Time modified | [optional] 
**visible** | **int** | visible | [optional] 

## Example

```python
from openapi_client.models.mod_iomadcertificate_get_iomadcertificates_by_courses200_response_iomadcertificates_inner import ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner from a JSON string
mod_iomadcertificate_get_iomadcertificates_by_courses200_response_iomadcertificates_inner_instance = ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner.from_json(json)
# print the JSON string representation of the object
print(ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner.to_json())

# convert the object into a dict
mod_iomadcertificate_get_iomadcertificates_by_courses200_response_iomadcertificates_inner_dict = mod_iomadcertificate_get_iomadcertificates_by_courses200_response_iomadcertificates_inner_instance.to_dict()
# create an instance of ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner from a dict
mod_iomadcertificate_get_iomadcertificates_by_courses200_response_iomadcertificates_inner_from_dict = ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner.from_dict(mod_iomadcertificate_get_iomadcertificates_by_courses200_response_iomadcertificates_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


