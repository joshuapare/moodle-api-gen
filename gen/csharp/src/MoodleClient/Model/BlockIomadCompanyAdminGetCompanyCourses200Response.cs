/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// BlockIomadCompanyAdminGetCompanyCourses200Response
    /// </summary>
    [DataContract(Name = "block_iomad_company_admin_get_company_courses_200_response")]
    public partial class BlockIomadCompanyAdminGetCompanyCourses200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockIomadCompanyAdminGetCompanyCourses200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BlockIomadCompanyAdminGetCompanyCourses200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockIomadCompanyAdminGetCompanyCourses200Response" /> class.
        /// </summary>
        /// <param name="companies">companies (required).</param>
        /// <param name="warnings">warnings.</param>
        public BlockIomadCompanyAdminGetCompanyCourses200Response(List<BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner> companies = default(List<BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner>), List<BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner> warnings = default(List<BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner>))
        {
            // to ensure "companies" is required (not null)
            if (companies == null)
            {
                throw new ArgumentNullException("companies is a required property for BlockIomadCompanyAdminGetCompanyCourses200Response and cannot be null");
            }
            this.Companies = companies;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Companies
        /// </summary>
        [DataMember(Name = "companies", IsRequired = true, EmitDefaultValue = true)]
        public List<BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner> Companies { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BlockIomadCompanyAdminGetCompanyCourses200Response {\n");
            sb.Append("  Companies: ").Append(Companies).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
