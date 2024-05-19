# ModWorkshopGetWorkshopAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assessingallowed** | **bool** | Is the user allowed to create/edit his assessments? | [default to null]
**Assessingexamplesallowed** | **bool** | Are reviewers allowed to create/edit their assessments of the example submissions?. | [default to null]
**Canaddinstance** | **bool** | Whether the user has the capability mod/workshop:addinstance allowed. | [default to null]
**Canallocate** | **bool** | Whether the user has the capability mod/workshop:allocate allowed. | [default to null]
**Candeletesubmissions** | **bool** | Whether the user has the capability mod/workshop:deletesubmissions allowed. | [default to null]
**Caneditdimensions** | **bool** | Whether the user has the capability mod/workshop:editdimensions allowed. | [default to null]
**Canexportsubmissions** | **bool** | Whether the user has the capability mod/workshop:exportsubmissions allowed. | [default to null]
**Canignoredeadlines** | **bool** | Whether the user has the capability mod/workshop:ignoredeadlines allowed. | [default to null]
**Canmanageexamples** | **bool** | Whether the user has the capability mod/workshop:manageexamples allowed. | [default to null]
**Canoverridegrades** | **bool** | Whether the user has the capability mod/workshop:overridegrades allowed. | [default to null]
**Canpeerassess** | **bool** | Whether the user has the capability mod/workshop:peerassess allowed. | [default to null]
**Canpublishsubmissions** | **bool** | Whether the user has the capability mod/workshop:publishsubmissions allowed. | [default to null]
**Cansubmit** | **bool** | Whether the user has the capability mod/workshop:submit allowed. | [default to null]
**Canswitchphase** | **bool** | Whether the user has the capability mod/workshop:switchphase allowed. | [default to null]
**Canview** | **bool** | Whether the user has the capability mod/workshop:view allowed. | [default to null]
**Canviewallassessments** | **bool** | Whether the user has the capability mod/workshop:viewallassessments allowed. | [default to null]
**Canviewallsubmissions** | **bool** | Whether the user has the capability mod/workshop:viewallsubmissions allowed. | [default to null]
**Canviewauthornames** | **bool** | Whether the user has the capability mod/workshop:viewauthornames allowed. | [default to null]
**Canviewauthorpublished** | **bool** | Whether the user has the capability mod/workshop:viewauthorpublished allowed. | [default to null]
**Canviewpublishedsubmissions** | **bool** | Whether the user has the capability mod/workshop:viewpublishedsubmissions allowed. | [default to null]
**Canviewreviewernames** | **bool** | Whether the user has the capability mod/workshop:viewreviewernames allowed. | [default to null]
**Creatingsubmissionallowed** | **bool** | Is the given user allowed to create their submission? | [default to null]
**Examplesassessedbeforeassessment** | **bool** | Whether the given user has assessed all his required examples before assessment                 (always true if there are not examples to assessor not configured to check before assessment). | [default to null]
**Examplesassessedbeforesubmission** | **bool** | Whether the given user has assessed all his required examples before submission                 (always true if there are not examples to assess or not configured to check before submission). | [default to null]
**Modifyingsubmissionallowed** | **bool** | Is the user allowed to modify his existing submission? | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWorkshopGetWorkshopAccessInformation200Response

`func NewModWorkshopGetWorkshopAccessInformation200Response(assessingallowed bool, assessingexamplesallowed bool, canaddinstance bool, canallocate bool, candeletesubmissions bool, caneditdimensions bool, canexportsubmissions bool, canignoredeadlines bool, canmanageexamples bool, canoverridegrades bool, canpeerassess bool, canpublishsubmissions bool, cansubmit bool, canswitchphase bool, canview bool, canviewallassessments bool, canviewallsubmissions bool, canviewauthornames bool, canviewauthorpublished bool, canviewpublishedsubmissions bool, canviewreviewernames bool, creatingsubmissionallowed bool, examplesassessedbeforeassessment bool, examplesassessedbeforesubmission bool, modifyingsubmissionallowed bool, ) *ModWorkshopGetWorkshopAccessInformation200Response`

NewModWorkshopGetWorkshopAccessInformation200Response instantiates a new ModWorkshopGetWorkshopAccessInformation200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetWorkshopAccessInformation200ResponseWithDefaults

`func NewModWorkshopGetWorkshopAccessInformation200ResponseWithDefaults() *ModWorkshopGetWorkshopAccessInformation200Response`

NewModWorkshopGetWorkshopAccessInformation200ResponseWithDefaults instantiates a new ModWorkshopGetWorkshopAccessInformation200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssessingallowed

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetAssessingallowed() bool`

GetAssessingallowed returns the Assessingallowed field if non-nil, zero value otherwise.

### GetAssessingallowedOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetAssessingallowedOk() (*bool, bool)`

GetAssessingallowedOk returns a tuple with the Assessingallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessingallowed

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetAssessingallowed(v bool)`

SetAssessingallowed sets Assessingallowed field to given value.


### GetAssessingexamplesallowed

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetAssessingexamplesallowed() bool`

GetAssessingexamplesallowed returns the Assessingexamplesallowed field if non-nil, zero value otherwise.

### GetAssessingexamplesallowedOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetAssessingexamplesallowedOk() (*bool, bool)`

GetAssessingexamplesallowedOk returns a tuple with the Assessingexamplesallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessingexamplesallowed

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetAssessingexamplesallowed(v bool)`

SetAssessingexamplesallowed sets Assessingexamplesallowed field to given value.


### GetCanaddinstance

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanaddinstance() bool`

GetCanaddinstance returns the Canaddinstance field if non-nil, zero value otherwise.

### GetCanaddinstanceOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanaddinstanceOk() (*bool, bool)`

GetCanaddinstanceOk returns a tuple with the Canaddinstance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanaddinstance

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanaddinstance(v bool)`

SetCanaddinstance sets Canaddinstance field to given value.


### GetCanallocate

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanallocate() bool`

GetCanallocate returns the Canallocate field if non-nil, zero value otherwise.

### GetCanallocateOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanallocateOk() (*bool, bool)`

GetCanallocateOk returns a tuple with the Canallocate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanallocate

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanallocate(v bool)`

SetCanallocate sets Canallocate field to given value.


### GetCandeletesubmissions

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCandeletesubmissions() bool`

GetCandeletesubmissions returns the Candeletesubmissions field if non-nil, zero value otherwise.

### GetCandeletesubmissionsOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCandeletesubmissionsOk() (*bool, bool)`

GetCandeletesubmissionsOk returns a tuple with the Candeletesubmissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandeletesubmissions

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCandeletesubmissions(v bool)`

SetCandeletesubmissions sets Candeletesubmissions field to given value.


### GetCaneditdimensions

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCaneditdimensions() bool`

GetCaneditdimensions returns the Caneditdimensions field if non-nil, zero value otherwise.

### GetCaneditdimensionsOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCaneditdimensionsOk() (*bool, bool)`

GetCaneditdimensionsOk returns a tuple with the Caneditdimensions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaneditdimensions

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCaneditdimensions(v bool)`

SetCaneditdimensions sets Caneditdimensions field to given value.


### GetCanexportsubmissions

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanexportsubmissions() bool`

GetCanexportsubmissions returns the Canexportsubmissions field if non-nil, zero value otherwise.

### GetCanexportsubmissionsOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanexportsubmissionsOk() (*bool, bool)`

GetCanexportsubmissionsOk returns a tuple with the Canexportsubmissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanexportsubmissions

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanexportsubmissions(v bool)`

SetCanexportsubmissions sets Canexportsubmissions field to given value.


### GetCanignoredeadlines

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanignoredeadlines() bool`

GetCanignoredeadlines returns the Canignoredeadlines field if non-nil, zero value otherwise.

### GetCanignoredeadlinesOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanignoredeadlinesOk() (*bool, bool)`

GetCanignoredeadlinesOk returns a tuple with the Canignoredeadlines field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanignoredeadlines

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanignoredeadlines(v bool)`

SetCanignoredeadlines sets Canignoredeadlines field to given value.


### GetCanmanageexamples

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanmanageexamples() bool`

GetCanmanageexamples returns the Canmanageexamples field if non-nil, zero value otherwise.

### GetCanmanageexamplesOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanmanageexamplesOk() (*bool, bool)`

GetCanmanageexamplesOk returns a tuple with the Canmanageexamples field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanageexamples

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanmanageexamples(v bool)`

SetCanmanageexamples sets Canmanageexamples field to given value.


### GetCanoverridegrades

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanoverridegrades() bool`

GetCanoverridegrades returns the Canoverridegrades field if non-nil, zero value otherwise.

### GetCanoverridegradesOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanoverridegradesOk() (*bool, bool)`

GetCanoverridegradesOk returns a tuple with the Canoverridegrades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanoverridegrades

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanoverridegrades(v bool)`

SetCanoverridegrades sets Canoverridegrades field to given value.


### GetCanpeerassess

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanpeerassess() bool`

GetCanpeerassess returns the Canpeerassess field if non-nil, zero value otherwise.

### GetCanpeerassessOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanpeerassessOk() (*bool, bool)`

GetCanpeerassessOk returns a tuple with the Canpeerassess field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanpeerassess

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanpeerassess(v bool)`

SetCanpeerassess sets Canpeerassess field to given value.


### GetCanpublishsubmissions

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanpublishsubmissions() bool`

GetCanpublishsubmissions returns the Canpublishsubmissions field if non-nil, zero value otherwise.

### GetCanpublishsubmissionsOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanpublishsubmissionsOk() (*bool, bool)`

GetCanpublishsubmissionsOk returns a tuple with the Canpublishsubmissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanpublishsubmissions

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanpublishsubmissions(v bool)`

SetCanpublishsubmissions sets Canpublishsubmissions field to given value.


### GetCansubmit

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCansubmit() bool`

GetCansubmit returns the Cansubmit field if non-nil, zero value otherwise.

### GetCansubmitOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCansubmitOk() (*bool, bool)`

GetCansubmitOk returns a tuple with the Cansubmit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCansubmit

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCansubmit(v bool)`

SetCansubmit sets Cansubmit field to given value.


### GetCanswitchphase

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanswitchphase() bool`

GetCanswitchphase returns the Canswitchphase field if non-nil, zero value otherwise.

### GetCanswitchphaseOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanswitchphaseOk() (*bool, bool)`

GetCanswitchphaseOk returns a tuple with the Canswitchphase field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanswitchphase

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanswitchphase(v bool)`

SetCanswitchphase sets Canswitchphase field to given value.


### GetCanview

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanview() bool`

GetCanview returns the Canview field if non-nil, zero value otherwise.

### GetCanviewOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanviewOk() (*bool, bool)`

GetCanviewOk returns a tuple with the Canview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanview

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanview(v bool)`

SetCanview sets Canview field to given value.


### GetCanviewallassessments

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanviewallassessments() bool`

GetCanviewallassessments returns the Canviewallassessments field if non-nil, zero value otherwise.

### GetCanviewallassessmentsOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanviewallassessmentsOk() (*bool, bool)`

GetCanviewallassessmentsOk returns a tuple with the Canviewallassessments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewallassessments

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanviewallassessments(v bool)`

SetCanviewallassessments sets Canviewallassessments field to given value.


### GetCanviewallsubmissions

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanviewallsubmissions() bool`

GetCanviewallsubmissions returns the Canviewallsubmissions field if non-nil, zero value otherwise.

### GetCanviewallsubmissionsOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanviewallsubmissionsOk() (*bool, bool)`

GetCanviewallsubmissionsOk returns a tuple with the Canviewallsubmissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewallsubmissions

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanviewallsubmissions(v bool)`

SetCanviewallsubmissions sets Canviewallsubmissions field to given value.


### GetCanviewauthornames

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanviewauthornames() bool`

GetCanviewauthornames returns the Canviewauthornames field if non-nil, zero value otherwise.

### GetCanviewauthornamesOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanviewauthornamesOk() (*bool, bool)`

GetCanviewauthornamesOk returns a tuple with the Canviewauthornames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewauthornames

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanviewauthornames(v bool)`

SetCanviewauthornames sets Canviewauthornames field to given value.


### GetCanviewauthorpublished

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanviewauthorpublished() bool`

GetCanviewauthorpublished returns the Canviewauthorpublished field if non-nil, zero value otherwise.

### GetCanviewauthorpublishedOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanviewauthorpublishedOk() (*bool, bool)`

GetCanviewauthorpublishedOk returns a tuple with the Canviewauthorpublished field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewauthorpublished

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanviewauthorpublished(v bool)`

SetCanviewauthorpublished sets Canviewauthorpublished field to given value.


### GetCanviewpublishedsubmissions

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanviewpublishedsubmissions() bool`

GetCanviewpublishedsubmissions returns the Canviewpublishedsubmissions field if non-nil, zero value otherwise.

### GetCanviewpublishedsubmissionsOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanviewpublishedsubmissionsOk() (*bool, bool)`

GetCanviewpublishedsubmissionsOk returns a tuple with the Canviewpublishedsubmissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewpublishedsubmissions

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanviewpublishedsubmissions(v bool)`

SetCanviewpublishedsubmissions sets Canviewpublishedsubmissions field to given value.


### GetCanviewreviewernames

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanviewreviewernames() bool`

GetCanviewreviewernames returns the Canviewreviewernames field if non-nil, zero value otherwise.

### GetCanviewreviewernamesOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCanviewreviewernamesOk() (*bool, bool)`

GetCanviewreviewernamesOk returns a tuple with the Canviewreviewernames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewreviewernames

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCanviewreviewernames(v bool)`

SetCanviewreviewernames sets Canviewreviewernames field to given value.


### GetCreatingsubmissionallowed

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCreatingsubmissionallowed() bool`

GetCreatingsubmissionallowed returns the Creatingsubmissionallowed field if non-nil, zero value otherwise.

### GetCreatingsubmissionallowedOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetCreatingsubmissionallowedOk() (*bool, bool)`

GetCreatingsubmissionallowedOk returns a tuple with the Creatingsubmissionallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatingsubmissionallowed

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetCreatingsubmissionallowed(v bool)`

SetCreatingsubmissionallowed sets Creatingsubmissionallowed field to given value.


### GetExamplesassessedbeforeassessment

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetExamplesassessedbeforeassessment() bool`

GetExamplesassessedbeforeassessment returns the Examplesassessedbeforeassessment field if non-nil, zero value otherwise.

### GetExamplesassessedbeforeassessmentOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetExamplesassessedbeforeassessmentOk() (*bool, bool)`

GetExamplesassessedbeforeassessmentOk returns a tuple with the Examplesassessedbeforeassessment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExamplesassessedbeforeassessment

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetExamplesassessedbeforeassessment(v bool)`

SetExamplesassessedbeforeassessment sets Examplesassessedbeforeassessment field to given value.


### GetExamplesassessedbeforesubmission

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetExamplesassessedbeforesubmission() bool`

GetExamplesassessedbeforesubmission returns the Examplesassessedbeforesubmission field if non-nil, zero value otherwise.

### GetExamplesassessedbeforesubmissionOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetExamplesassessedbeforesubmissionOk() (*bool, bool)`

GetExamplesassessedbeforesubmissionOk returns a tuple with the Examplesassessedbeforesubmission field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExamplesassessedbeforesubmission

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetExamplesassessedbeforesubmission(v bool)`

SetExamplesassessedbeforesubmission sets Examplesassessedbeforesubmission field to given value.


### GetModifyingsubmissionallowed

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetModifyingsubmissionallowed() bool`

GetModifyingsubmissionallowed returns the Modifyingsubmissionallowed field if non-nil, zero value otherwise.

### GetModifyingsubmissionallowedOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetModifyingsubmissionallowedOk() (*bool, bool)`

GetModifyingsubmissionallowedOk returns a tuple with the Modifyingsubmissionallowed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModifyingsubmissionallowed

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetModifyingsubmissionallowed(v bool)`

SetModifyingsubmissionallowed sets Modifyingsubmissionallowed field to given value.


### GetWarnings

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWorkshopGetWorkshopAccessInformation200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


