# CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classification** | **String** | future, inprogress, or past | 
**customfieldname** | Option<**String**> | Used when classification = customfield | [optional]
**customfieldvalue** | Option<**String**> | Used when classification = customfield | [optional]
**eventsfrom** | Option<**i32**> | Optional starting timestamp for action events | [optional][default to null]
**eventsto** | Option<**i32**> | Optional ending timestamp for action events | [optional][default to null]
**limit** | Option<**i32**> | Result set limit | [optional][default to 0]
**offset** | Option<**i32**> | Result set offset | [optional][default to 0]
**searchvalue** | Option<**String**> | The value a user wishes to search against | [optional]
**sort** | Option<**String**> | Sort string | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


