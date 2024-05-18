# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_competency_update_competency_request import CoreCompetencyUpdateCompetencyRequest

class TestCoreCompetencyUpdateCompetencyRequest(unittest.TestCase):
    """CoreCompetencyUpdateCompetencyRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCompetencyUpdateCompetencyRequest:
        """Test CoreCompetencyUpdateCompetencyRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCompetencyUpdateCompetencyRequest`
        """
        model = CoreCompetencyUpdateCompetencyRequest()
        if include_optional:
            return CoreCompetencyUpdateCompetencyRequest(
                competency = openapi_client.models.core_competency_update_competency_request_competency.core_competency_update_competency_request_competency(
                    competencyframeworkid = 56, 
                    description = '', 
                    descriptionformat = 56, 
                    id = 56, 
                    idnumber = '', 
                    parentid = 56, 
                    path = 'null', 
                    ruleconfig = '', 
                    ruleoutcome = 56, 
                    ruletype = '', 
                    scaleconfiguration = '', 
                    scaleid = 56, 
                    shortname = '', 
                    sortorder = 56, 
                    timecreated = 56, 
                    timemodified = 56, 
                    usermodified = 56, )
            )
        else:
            return CoreCompetencyUpdateCompetencyRequest(
                competency = openapi_client.models.core_competency_update_competency_request_competency.core_competency_update_competency_request_competency(
                    competencyframeworkid = 56, 
                    description = '', 
                    descriptionformat = 56, 
                    id = 56, 
                    idnumber = '', 
                    parentid = 56, 
                    path = 'null', 
                    ruleconfig = '', 
                    ruleoutcome = 56, 
                    ruletype = '', 
                    scaleconfiguration = '', 
                    scaleid = 56, 
                    shortname = '', 
                    sortorder = 56, 
                    timecreated = 56, 
                    timemodified = 56, 
                    usermodified = 56, ),
        )
        """

    def testCoreCompetencyUpdateCompetencyRequest(self):
        """Test CoreCompetencyUpdateCompetencyRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
