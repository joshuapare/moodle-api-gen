

# CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner

Activity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cmid** | **Integer** | course module ID |  [optional] |
|**details** | [**List&lt;CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner&gt;**](CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.md) |  |  [optional] |
|**hascompletion** | **Boolean** | Whether this activity module has completion enabled |  [optional] |
|**instance** | **Integer** | instance ID |  [optional] |
|**isautomatic** | **Boolean** | Whether this activity module instance tracks completion automatically. |  [optional] |
|**istrackeduser** | **Boolean** | Whether completion is being tracked for this user. |  [optional] |
|**modname** | **String** | activity module name |  [optional] |
|**overrideby** | **Integer** | The user id who has overriden the status, or null |  [optional] |
|**state** | **Integer** | Completion state value:                                     0 means incomplete,                                     1 complete,                                     2 complete pass,                                     3 complete fail |  [optional] |
|**timecompleted** | **Integer** | timestamp for completed activity |  [optional] |
|**tracking** | **Integer** | type of tracking:                                     0 means none,                                     1 manual,                                     2 automatic |  [optional] |
|**uservisible** | **Boolean** | Whether this activity is visible to the user. |  [optional] |
|**valueused** | **Boolean** | Whether the completion status affects the availability of another activity. |  [optional] |



