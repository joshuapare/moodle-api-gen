# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_assign_save_grade_request_advancedgradingdata_guide_criteria_inner import ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner

class TestModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner(unittest.TestCase):
    """ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner:
        """Test ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner`
        """
        model = ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner()
        if include_optional:
            return ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner(
                criterionid = 56,
                fillings = [
                    openapi_client.models.mod_assign_save_grade_request_advancedgradingdata_guide_criteria_inner_fillings_inner.mod_assign_save_grade_request_advancedgradingdata_guide_criteria_inner_fillings_inner(
                        criterionid = 56, 
                        levelid = 56, 
                        remark = '', 
                        remarkformat = 56, 
                        score = 1.337, )
                    ]
            )
        else:
            return ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner(
        )
        """

    def testModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner(self):
        """Test ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
