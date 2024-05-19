# ModWorkshopGetWorkshopAccessInformation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assessingallowed** | **bool** | Is the user allowed to create/edit his assessments? | [default to False]
**assessingexamplesallowed** | **bool** | Are reviewers allowed to create/edit their assessments of the example submissions?. | [default to False]
**canaddinstance** | **bool** | Whether the user has the capability mod/workshop:addinstance allowed. | [default to False]
**canallocate** | **bool** | Whether the user has the capability mod/workshop:allocate allowed. | [default to False]
**candeletesubmissions** | **bool** | Whether the user has the capability mod/workshop:deletesubmissions allowed. | [default to False]
**caneditdimensions** | **bool** | Whether the user has the capability mod/workshop:editdimensions allowed. | [default to False]
**canexportsubmissions** | **bool** | Whether the user has the capability mod/workshop:exportsubmissions allowed. | [default to False]
**canignoredeadlines** | **bool** | Whether the user has the capability mod/workshop:ignoredeadlines allowed. | [default to False]
**canmanageexamples** | **bool** | Whether the user has the capability mod/workshop:manageexamples allowed. | [default to False]
**canoverridegrades** | **bool** | Whether the user has the capability mod/workshop:overridegrades allowed. | [default to False]
**canpeerassess** | **bool** | Whether the user has the capability mod/workshop:peerassess allowed. | [default to False]
**canpublishsubmissions** | **bool** | Whether the user has the capability mod/workshop:publishsubmissions allowed. | [default to False]
**cansubmit** | **bool** | Whether the user has the capability mod/workshop:submit allowed. | [default to False]
**canswitchphase** | **bool** | Whether the user has the capability mod/workshop:switchphase allowed. | [default to False]
**canview** | **bool** | Whether the user has the capability mod/workshop:view allowed. | [default to False]
**canviewallassessments** | **bool** | Whether the user has the capability mod/workshop:viewallassessments allowed. | [default to False]
**canviewallsubmissions** | **bool** | Whether the user has the capability mod/workshop:viewallsubmissions allowed. | [default to False]
**canviewauthornames** | **bool** | Whether the user has the capability mod/workshop:viewauthornames allowed. | [default to False]
**canviewauthorpublished** | **bool** | Whether the user has the capability mod/workshop:viewauthorpublished allowed. | [default to False]
**canviewpublishedsubmissions** | **bool** | Whether the user has the capability mod/workshop:viewpublishedsubmissions allowed. | [default to False]
**canviewreviewernames** | **bool** | Whether the user has the capability mod/workshop:viewreviewernames allowed. | [default to False]
**creatingsubmissionallowed** | **bool** | Is the given user allowed to create their submission? | [default to False]
**examplesassessedbeforeassessment** | **bool** | Whether the given user has assessed all his required examples before assessment                 (always true if there are not examples to assessor not configured to check before assessment). | [default to False]
**examplesassessedbeforesubmission** | **bool** | Whether the given user has assessed all his required examples before submission                 (always true if there are not examples to assess or not configured to check before submission). | [default to False]
**modifyingsubmissionallowed** | **bool** | Is the user allowed to modify his existing submission? | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_get_workshop_access_information200_response import ModWorkshopGetWorkshopAccessInformation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetWorkshopAccessInformation200Response from a JSON string
mod_workshop_get_workshop_access_information200_response_instance = ModWorkshopGetWorkshopAccessInformation200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetWorkshopAccessInformation200Response.to_json())

# convert the object into a dict
mod_workshop_get_workshop_access_information200_response_dict = mod_workshop_get_workshop_access_information200_response_instance.to_dict()
# create an instance of ModWorkshopGetWorkshopAccessInformation200Response from a dict
mod_workshop_get_workshop_access_information200_response_from_dict = ModWorkshopGetWorkshopAccessInformation200Response.from_dict(mod_workshop_get_workshop_access_information200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


