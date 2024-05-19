# CoreGradesUpdateGradesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityid** | **i32** | The activity ID | [default to null]
**component** | **String** | A component, for example mod_forum or mod_quiz | [default to null]
**courseid** | **i32** | id of course | 
**grades** | Option<[**Vec<models::CoreGradesUpdateGradesRequestGradesInner>**](core_grades_update_grades_request_grades_inner.md)> |  | [optional]
**itemdetails** | Option<[**models::CoreGradesUpdateGradesRequestItemdetails**](core_grades_update_grades_request_itemdetails.md)> |  | [optional]
**itemnumber** | **i32** | grade item ID number for modules that have multiple grades. Typically this is 0. | [default to null]
**source** | **String** | The source of the grade update | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


