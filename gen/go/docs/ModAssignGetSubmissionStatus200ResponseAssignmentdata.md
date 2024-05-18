# ModAssignGetSubmissionStatus200ResponseAssignmentdata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Activity** | Pointer to **string** | Text of activity | [optional] [default to "null"]
**Activityformat** | Pointer to **int32** | activity format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Attachments** | Pointer to [**ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments**](ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments.md) |  | [optional] 

## Methods

### NewModAssignGetSubmissionStatus200ResponseAssignmentdata

`func NewModAssignGetSubmissionStatus200ResponseAssignmentdata() *ModAssignGetSubmissionStatus200ResponseAssignmentdata`

NewModAssignGetSubmissionStatus200ResponseAssignmentdata instantiates a new ModAssignGetSubmissionStatus200ResponseAssignmentdata object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetSubmissionStatus200ResponseAssignmentdataWithDefaults

`func NewModAssignGetSubmissionStatus200ResponseAssignmentdataWithDefaults() *ModAssignGetSubmissionStatus200ResponseAssignmentdata`

NewModAssignGetSubmissionStatus200ResponseAssignmentdataWithDefaults instantiates a new ModAssignGetSubmissionStatus200ResponseAssignmentdata object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActivity

`func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) GetActivity() string`

GetActivity returns the Activity field if non-nil, zero value otherwise.

### GetActivityOk

`func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) GetActivityOk() (*string, bool)`

GetActivityOk returns a tuple with the Activity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivity

`func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) SetActivity(v string)`

SetActivity sets Activity field to given value.

### HasActivity

`func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) HasActivity() bool`

HasActivity returns a boolean if a field has been set.

### GetActivityformat

`func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) GetActivityformat() int32`

GetActivityformat returns the Activityformat field if non-nil, zero value otherwise.

### GetActivityformatOk

`func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) GetActivityformatOk() (*int32, bool)`

GetActivityformatOk returns a tuple with the Activityformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityformat

`func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) SetActivityformat(v int32)`

SetActivityformat sets Activityformat field to given value.

### HasActivityformat

`func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) HasActivityformat() bool`

HasActivityformat returns a boolean if a field has been set.

### GetAttachments

`func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) GetAttachments() ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) GetAttachmentsOk() (*ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) SetAttachments(v ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments)`

SetAttachments sets Attachments field to given value.

### HasAttachments

`func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) HasAttachments() bool`

HasAttachments returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


