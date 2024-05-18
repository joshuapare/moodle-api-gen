# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from openapi_client.models.mod_assign_save_grade_request_advancedgradingdata import ModAssignSaveGradeRequestAdvancedgradingdata
from openapi_client.models.mod_assign_save_grades_request_grades_inner_plugindata import ModAssignSaveGradesRequestGradesInnerPlugindata
from typing import Optional, Set
from typing_extensions import Self

class ModAssignSaveGradesRequestGradesInner(BaseModel):
    """
    ModAssignSaveGradesRequestGradesInner
    """ # noqa: E501
    addattempt: Optional[StrictBool] = Field(default=False, description="Allow another attempt if manual attempt reopen method")
    advancedgradingdata: Optional[ModAssignSaveGradeRequestAdvancedgradingdata] = None
    attemptnumber: Optional[StrictInt] = Field(default=None, description="The attempt number (-1 means latest attempt)")
    grade: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The new grade for this user. Ignored if advanced grading used")
    plugindata: Optional[ModAssignSaveGradesRequestGradesInnerPlugindata] = None
    userid: Optional[StrictInt] = Field(default=None, description="The student id to operate on")
    workflowstate: Optional[StrictStr] = Field(default=None, description="The next marking workflow state")
    __properties: ClassVar[List[str]] = ["addattempt", "advancedgradingdata", "attemptnumber", "grade", "plugindata", "userid", "workflowstate"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of ModAssignSaveGradesRequestGradesInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of advancedgradingdata
        if self.advancedgradingdata:
            _dict['advancedgradingdata'] = self.advancedgradingdata.to_dict()
        # override the default output from pydantic by calling `to_dict()` of plugindata
        if self.plugindata:
            _dict['plugindata'] = self.plugindata.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModAssignSaveGradesRequestGradesInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "addattempt": obj.get("addattempt") if obj.get("addattempt") is not None else False,
            "advancedgradingdata": ModAssignSaveGradeRequestAdvancedgradingdata.from_dict(obj["advancedgradingdata"]) if obj.get("advancedgradingdata") is not None else None,
            "attemptnumber": obj.get("attemptnumber"),
            "grade": obj.get("grade"),
            "plugindata": ModAssignSaveGradesRequestGradesInnerPlugindata.from_dict(obj["plugindata"]) if obj.get("plugindata") is not None else None,
            "userid": obj.get("userid"),
            "workflowstate": obj.get("workflowstate")
        })
        return _obj


