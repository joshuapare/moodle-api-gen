# ModFeedbackGetFeedbackAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cancomplete** | **bool** | Whether the user can complete the feedback or not. | [default to null]
**Candeletesubmissions** | **bool** | Whether the user can delete submissions or not. | [default to null]
**Canedititems** | **bool** | Whether the user can edit feedback items or not. | [default to null]
**Cansubmit** | **bool** | Whether the user can submit the feedback or not. | [default to null]
**Canviewanalysis** | **bool** | Whether the user can view the analysis or not. | [default to null]
**Canviewreports** | **bool** | Whether the user can view the feedback reports or not. | [default to null]
**Isalreadysubmitted** | **bool** | Whether the feedback is already submitted or not. | [default to null]
**Isanonymous** | **bool** | Whether the feedback is anonymous or not. | [default to null]
**Isempty** | **bool** | Whether the feedback has questions or not. | [default to null]
**Isopen** | **bool** | Whether the feedback has active access time restrictions or not. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModFeedbackGetFeedbackAccessInformation200Response

`func NewModFeedbackGetFeedbackAccessInformation200Response(cancomplete bool, candeletesubmissions bool, canedititems bool, cansubmit bool, canviewanalysis bool, canviewreports bool, isalreadysubmitted bool, isanonymous bool, isempty bool, isopen bool, ) *ModFeedbackGetFeedbackAccessInformation200Response`

NewModFeedbackGetFeedbackAccessInformation200Response instantiates a new ModFeedbackGetFeedbackAccessInformation200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetFeedbackAccessInformation200ResponseWithDefaults

`func NewModFeedbackGetFeedbackAccessInformation200ResponseWithDefaults() *ModFeedbackGetFeedbackAccessInformation200Response`

NewModFeedbackGetFeedbackAccessInformation200ResponseWithDefaults instantiates a new ModFeedbackGetFeedbackAccessInformation200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCancomplete

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetCancomplete() bool`

GetCancomplete returns the Cancomplete field if non-nil, zero value otherwise.

### GetCancompleteOk

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetCancompleteOk() (*bool, bool)`

GetCancompleteOk returns a tuple with the Cancomplete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancomplete

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) SetCancomplete(v bool)`

SetCancomplete sets Cancomplete field to given value.


### GetCandeletesubmissions

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetCandeletesubmissions() bool`

GetCandeletesubmissions returns the Candeletesubmissions field if non-nil, zero value otherwise.

### GetCandeletesubmissionsOk

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetCandeletesubmissionsOk() (*bool, bool)`

GetCandeletesubmissionsOk returns a tuple with the Candeletesubmissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandeletesubmissions

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) SetCandeletesubmissions(v bool)`

SetCandeletesubmissions sets Candeletesubmissions field to given value.


### GetCanedititems

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetCanedititems() bool`

GetCanedititems returns the Canedititems field if non-nil, zero value otherwise.

### GetCanedititemsOk

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetCanedititemsOk() (*bool, bool)`

GetCanedititemsOk returns a tuple with the Canedititems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanedititems

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) SetCanedititems(v bool)`

SetCanedititems sets Canedititems field to given value.


### GetCansubmit

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetCansubmit() bool`

GetCansubmit returns the Cansubmit field if non-nil, zero value otherwise.

### GetCansubmitOk

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetCansubmitOk() (*bool, bool)`

GetCansubmitOk returns a tuple with the Cansubmit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCansubmit

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) SetCansubmit(v bool)`

SetCansubmit sets Cansubmit field to given value.


### GetCanviewanalysis

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetCanviewanalysis() bool`

GetCanviewanalysis returns the Canviewanalysis field if non-nil, zero value otherwise.

### GetCanviewanalysisOk

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetCanviewanalysisOk() (*bool, bool)`

GetCanviewanalysisOk returns a tuple with the Canviewanalysis field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewanalysis

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) SetCanviewanalysis(v bool)`

SetCanviewanalysis sets Canviewanalysis field to given value.


### GetCanviewreports

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetCanviewreports() bool`

GetCanviewreports returns the Canviewreports field if non-nil, zero value otherwise.

### GetCanviewreportsOk

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetCanviewreportsOk() (*bool, bool)`

GetCanviewreportsOk returns a tuple with the Canviewreports field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewreports

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) SetCanviewreports(v bool)`

SetCanviewreports sets Canviewreports field to given value.


### GetIsalreadysubmitted

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetIsalreadysubmitted() bool`

GetIsalreadysubmitted returns the Isalreadysubmitted field if non-nil, zero value otherwise.

### GetIsalreadysubmittedOk

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetIsalreadysubmittedOk() (*bool, bool)`

GetIsalreadysubmittedOk returns a tuple with the Isalreadysubmitted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsalreadysubmitted

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) SetIsalreadysubmitted(v bool)`

SetIsalreadysubmitted sets Isalreadysubmitted field to given value.


### GetIsanonymous

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetIsanonymous() bool`

GetIsanonymous returns the Isanonymous field if non-nil, zero value otherwise.

### GetIsanonymousOk

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetIsanonymousOk() (*bool, bool)`

GetIsanonymousOk returns a tuple with the Isanonymous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsanonymous

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) SetIsanonymous(v bool)`

SetIsanonymous sets Isanonymous field to given value.


### GetIsempty

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetIsempty() bool`

GetIsempty returns the Isempty field if non-nil, zero value otherwise.

### GetIsemptyOk

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetIsemptyOk() (*bool, bool)`

GetIsemptyOk returns a tuple with the Isempty field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsempty

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) SetIsempty(v bool)`

SetIsempty sets Isempty field to given value.


### GetIsopen

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetIsopen() bool`

GetIsopen returns the Isopen field if non-nil, zero value otherwise.

### GetIsopenOk

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetIsopenOk() (*bool, bool)`

GetIsopenOk returns a tuple with the Isopen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsopen

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) SetIsopen(v bool)`

SetIsopen sets Isopen field to given value.


### GetWarnings

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModFeedbackGetFeedbackAccessInformation200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


