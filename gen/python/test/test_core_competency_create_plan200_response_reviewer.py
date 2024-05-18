# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_competency_create_plan200_response_reviewer import CoreCompetencyCreatePlan200ResponseReviewer

class TestCoreCompetencyCreatePlan200ResponseReviewer(unittest.TestCase):
    """CoreCompetencyCreatePlan200ResponseReviewer unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCompetencyCreatePlan200ResponseReviewer:
        """Test CoreCompetencyCreatePlan200ResponseReviewer
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCompetencyCreatePlan200ResponseReviewer`
        """
        model = CoreCompetencyCreatePlan200ResponseReviewer()
        if include_optional:
            return CoreCompetencyCreatePlan200ResponseReviewer(
                department = '',
                email = '',
                fullname = '',
                id = 56,
                identity = 'null',
                idnumber = '',
                institution = '',
                phone1 = '',
                phone2 = '',
                profileimageurl = 'null',
                profileimageurlsmall = 'null',
                profileurl = 'null'
            )
        else:
            return CoreCompetencyCreatePlan200ResponseReviewer(
                department = '',
                email = '',
                fullname = '',
                id = 56,
                identity = 'null',
                idnumber = '',
                institution = '',
                phone1 = '',
                phone2 = '',
                profileimageurl = 'null',
                profileimageurlsmall = 'null',
                profileurl = 'null',
        )
        """

    def testCoreCompetencyCreatePlan200ResponseReviewer(self):
        """Test CoreCompetencyCreatePlan200ResponseReviewer"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()