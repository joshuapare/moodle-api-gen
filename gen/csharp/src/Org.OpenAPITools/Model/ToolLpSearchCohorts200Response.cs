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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ToolLpSearchCohorts200Response
    /// </summary>
    [DataContract(Name = "tool_lp_search_cohorts_200_response")]
    public partial class ToolLpSearchCohorts200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpSearchCohorts200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolLpSearchCohorts200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpSearchCohorts200Response" /> class.
        /// </summary>
        /// <param name="cohorts">cohorts (required).</param>
        public ToolLpSearchCohorts200Response(List<ToolLpSearchCohorts200ResponseCohortsInner> cohorts = default(List<ToolLpSearchCohorts200ResponseCohortsInner>))
        {
            // to ensure "cohorts" is required (not null)
            if (cohorts == null)
            {
                throw new ArgumentNullException("cohorts is a required property for ToolLpSearchCohorts200Response and cannot be null");
            }
            this.Cohorts = cohorts;
        }

        /// <summary>
        /// Gets or Sets Cohorts
        /// </summary>
        [DataMember(Name = "cohorts", IsRequired = true, EmitDefaultValue = true)]
        public List<ToolLpSearchCohorts200ResponseCohortsInner> Cohorts { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolLpSearchCohorts200Response {\n");
            sb.Append("  Cohorts: ").Append(Cohorts).Append("\n");
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
