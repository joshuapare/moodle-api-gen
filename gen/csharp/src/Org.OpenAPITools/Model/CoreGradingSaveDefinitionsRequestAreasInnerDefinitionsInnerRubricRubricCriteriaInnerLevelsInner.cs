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
    /// CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner
    /// </summary>
    [DataContract(Name = "core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner_levels_inner")]
    public partial class CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner" /> class.
        /// </summary>
        /// <param name="definition">definition.</param>
        /// <param name="definitionformat">definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN).</param>
        /// <param name="id">level id.</param>
        /// <param name="score">score.</param>
        public CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner(string definition = default(string), int definitionformat = default(int), int id = default(int), decimal score = default(decimal))
        {
            this.Definition = definition;
            this.Definitionformat = definitionformat;
            this.Id = id;
            this.Score = score;
        }

        /// <summary>
        /// definition
        /// </summary>
        /// <value>definition</value>
        [DataMember(Name = "definition", EmitDefaultValue = false)]
        public string Definition { get; set; }

        /// <summary>
        /// definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "definitionformat", EmitDefaultValue = false)]
        public int Definitionformat { get; set; }

        /// <summary>
        /// level id
        /// </summary>
        /// <value>level id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// score
        /// </summary>
        /// <value>score</value>
        [DataMember(Name = "score", EmitDefaultValue = false)]
        public decimal Score { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner {\n");
            sb.Append("  Definition: ").Append(Definition).Append("\n");
            sb.Append("  Definitionformat: ").Append(Definitionformat).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Score: ").Append(Score).Append("\n");
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
