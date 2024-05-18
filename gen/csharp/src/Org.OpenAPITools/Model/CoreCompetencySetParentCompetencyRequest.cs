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
    /// CoreCompetencySetParentCompetencyRequest
    /// </summary>
    [DataContract(Name = "core_competency_set_parent_competency_request")]
    public partial class CoreCompetencySetParentCompetencyRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencySetParentCompetencyRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCompetencySetParentCompetencyRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencySetParentCompetencyRequest" /> class.
        /// </summary>
        /// <param name="competencyid">The competency id (required).</param>
        /// <param name="parentid">The new competency parent id (required) (default to null).</param>
        public CoreCompetencySetParentCompetencyRequest(int competencyid = default(int), int parentid = null)
        {
            this.Competencyid = competencyid;
            this.Parentid = parentid;
        }

        /// <summary>
        /// The competency id
        /// </summary>
        /// <value>The competency id</value>
        [DataMember(Name = "competencyid", IsRequired = true, EmitDefaultValue = true)]
        public int Competencyid { get; set; }

        /// <summary>
        /// The new competency parent id
        /// </summary>
        /// <value>The new competency parent id</value>
        [DataMember(Name = "parentid", IsRequired = true, EmitDefaultValue = true)]
        public int Parentid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCompetencySetParentCompetencyRequest {\n");
            sb.Append("  Competencyid: ").Append(Competencyid).Append("\n");
            sb.Append("  Parentid: ").Append(Parentid).Append("\n");
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
