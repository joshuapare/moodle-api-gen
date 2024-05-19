# ModFeedbackProcessPage200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Completed** | **bool** | If the user completed the feedback. | [default to null]
**Completionpagecontents** | **string** | The completion page contents. | [default to "null"]
**Jumpto** | **int32** | The page to jump to. | [default to null]
**Siteaftersubmit** | **string** | The link (could be relative) to show after submit. | [default to "null"]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModFeedbackProcessPage200Response

`func NewModFeedbackProcessPage200Response(completed bool, completionpagecontents string, jumpto int32, siteaftersubmit string, ) *ModFeedbackProcessPage200Response`

NewModFeedbackProcessPage200Response instantiates a new ModFeedbackProcessPage200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackProcessPage200ResponseWithDefaults

`func NewModFeedbackProcessPage200ResponseWithDefaults() *ModFeedbackProcessPage200Response`

NewModFeedbackProcessPage200ResponseWithDefaults instantiates a new ModFeedbackProcessPage200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompleted

`func (o *ModFeedbackProcessPage200Response) GetCompleted() bool`

GetCompleted returns the Completed field if non-nil, zero value otherwise.

### GetCompletedOk

`func (o *ModFeedbackProcessPage200Response) GetCompletedOk() (*bool, bool)`

GetCompletedOk returns a tuple with the Completed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompleted

`func (o *ModFeedbackProcessPage200Response) SetCompleted(v bool)`

SetCompleted sets Completed field to given value.


### GetCompletionpagecontents

`func (o *ModFeedbackProcessPage200Response) GetCompletionpagecontents() string`

GetCompletionpagecontents returns the Completionpagecontents field if non-nil, zero value otherwise.

### GetCompletionpagecontentsOk

`func (o *ModFeedbackProcessPage200Response) GetCompletionpagecontentsOk() (*string, bool)`

GetCompletionpagecontentsOk returns a tuple with the Completionpagecontents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionpagecontents

`func (o *ModFeedbackProcessPage200Response) SetCompletionpagecontents(v string)`

SetCompletionpagecontents sets Completionpagecontents field to given value.


### GetJumpto

`func (o *ModFeedbackProcessPage200Response) GetJumpto() int32`

GetJumpto returns the Jumpto field if non-nil, zero value otherwise.

### GetJumptoOk

`func (o *ModFeedbackProcessPage200Response) GetJumptoOk() (*int32, bool)`

GetJumptoOk returns a tuple with the Jumpto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJumpto

`func (o *ModFeedbackProcessPage200Response) SetJumpto(v int32)`

SetJumpto sets Jumpto field to given value.


### GetSiteaftersubmit

`func (o *ModFeedbackProcessPage200Response) GetSiteaftersubmit() string`

GetSiteaftersubmit returns the Siteaftersubmit field if non-nil, zero value otherwise.

### GetSiteaftersubmitOk

`func (o *ModFeedbackProcessPage200Response) GetSiteaftersubmitOk() (*string, bool)`

GetSiteaftersubmitOk returns a tuple with the Siteaftersubmit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSiteaftersubmit

`func (o *ModFeedbackProcessPage200Response) SetSiteaftersubmit(v string)`

SetSiteaftersubmit sets Siteaftersubmit field to given value.


### GetWarnings

`func (o *ModFeedbackProcessPage200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModFeedbackProcessPage200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModFeedbackProcessPage200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModFeedbackProcessPage200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


