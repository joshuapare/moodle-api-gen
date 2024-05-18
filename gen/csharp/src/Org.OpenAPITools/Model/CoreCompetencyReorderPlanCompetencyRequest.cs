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
    /// CoreCompetencyReorderPlanCompetencyRequest
    /// </summary>
    [DataContract(Name = "core_competency_reorder_plan_competency_request")]
    public partial class CoreCompetencyReorderPlanCompetencyRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyReorderPlanCompetencyRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCompetencyReorderPlanCompetencyRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyReorderPlanCompetencyRequest" /> class.
        /// </summary>
        /// <param name="competencyidfrom">The competency id we are moving (required).</param>
        /// <param name="competencyidto">The competency id we are moving to (required).</param>
        /// <param name="planid">The plan id (required).</param>
        public CoreCompetencyReorderPlanCompetencyRequest(int competencyidfrom = default(int), int competencyidto = default(int), int planid = default(int))
        {
            this.Competencyidfrom = competencyidfrom;
            this.Competencyidto = competencyidto;
            this.Planid = planid;
        }

        /// <summary>
        /// The competency id we are moving
        /// </summary>
        /// <value>The competency id we are moving</value>
        [DataMember(Name = "competencyidfrom", IsRequired = true, EmitDefaultValue = true)]
        public int Competencyidfrom { get; set; }

        /// <summary>
        /// The competency id we are moving to
        /// </summary>
        /// <value>The competency id we are moving to</value>
        [DataMember(Name = "competencyidto", IsRequired = true, EmitDefaultValue = true)]
        public int Competencyidto { get; set; }

        /// <summary>
        /// The plan id
        /// </summary>
        /// <value>The plan id</value>
        [DataMember(Name = "planid", IsRequired = true, EmitDefaultValue = true)]
        public int Planid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCompetencyReorderPlanCompetencyRequest {\n");
            sb.Append("  Competencyidfrom: ").Append(Competencyidfrom).Append("\n");
            sb.Append("  Competencyidto: ").Append(Competencyidto).Append("\n");
            sb.Append("  Planid: ").Append(Planid).Append("\n");
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