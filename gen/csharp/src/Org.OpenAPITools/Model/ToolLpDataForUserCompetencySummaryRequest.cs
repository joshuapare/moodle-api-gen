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
    /// ToolLpDataForUserCompetencySummaryRequest
    /// </summary>
    [DataContract(Name = "tool_lp_data_for_user_competency_summary_request")]
    public partial class ToolLpDataForUserCompetencySummaryRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForUserCompetencySummaryRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolLpDataForUserCompetencySummaryRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForUserCompetencySummaryRequest" /> class.
        /// </summary>
        /// <param name="competencyid">Data base record id for the competency (required).</param>
        /// <param name="userid">Data base record id for the user (required) (default to null).</param>
        public ToolLpDataForUserCompetencySummaryRequest(int competencyid = default(int), int userid = null)
        {
            this.Competencyid = competencyid;
            this.Userid = userid;
        }

        /// <summary>
        /// Data base record id for the competency
        /// </summary>
        /// <value>Data base record id for the competency</value>
        [DataMember(Name = "competencyid", IsRequired = true, EmitDefaultValue = true)]
        public int Competencyid { get; set; }

        /// <summary>
        /// Data base record id for the user
        /// </summary>
        /// <value>Data base record id for the user</value>
        [DataMember(Name = "userid", IsRequired = true, EmitDefaultValue = true)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolLpDataForUserCompetencySummaryRequest {\n");
            sb.Append("  Competencyid: ").Append(Competencyid).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
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
