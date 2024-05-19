# ModWorkshopUpdateAssessmentRequestDataInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The assessment data (use WS get_assessment_form_definition for obtaining the data to sent).                                 Apart from that data, you can optionally send:                                 feedbackauthor (str); the feedback for the submission author                                 feedbackauthorformat (int); the format of the feedbackauthor                                 feedbackauthorinlineattachmentsid (int); the draft file area for the editor attachments                                 feedbackauthorattachmentsid (int); the draft file area id for the feedback attachments | [optional] [default to 'null']
**value** | **str** | The value of the option. | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_update_assessment_request_data_inner import ModWorkshopUpdateAssessmentRequestDataInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopUpdateAssessmentRequestDataInner from a JSON string
mod_workshop_update_assessment_request_data_inner_instance = ModWorkshopUpdateAssessmentRequestDataInner.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopUpdateAssessmentRequestDataInner.to_json())

# convert the object into a dict
mod_workshop_update_assessment_request_data_inner_dict = mod_workshop_update_assessment_request_data_inner_instance.to_dict()
# create an instance of ModWorkshopUpdateAssessmentRequestDataInner from a dict
mod_workshop_update_assessment_request_data_inner_from_dict = ModWorkshopUpdateAssessmentRequestDataInner.from_dict(mod_workshop_update_assessment_request_data_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


