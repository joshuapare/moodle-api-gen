# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.block_iomad_company_admin_get_companies200_response_companies_inner import BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner

class TestBlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner(unittest.TestCase):
    """BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner:
        """Test BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner`
        """
        model = BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner()
        if include_optional:
            return BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner(
                address = '',
                autosubscribe = 56,
                city = '',
                code = '',
                companyterminated = 56,
                country = '',
                custom1 = '',
                custom2 = '',
                custom3 = '',
                customcss = '',
                ecommerce = 56,
                headingcolor = '',
                hostname = '',
                htmleditor = 56,
                id = 56,
                lang = '',
                linkcolor = '',
                maildigest = 56,
                maildisplay = 56,
                mailformat = 56,
                maincolor = '',
                maxusers = 56,
                name = '',
                parentid = 56,
                region = '',
                screenreader = 56,
                shortname = '',
                suspendafter = 56,
                suspended = 56,
                theme = '',
                timezone = '',
                trackforums = 56,
                validto = 56
            )
        else:
            return BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner(
        )
        """

    def testBlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner(self):
        """Test BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()