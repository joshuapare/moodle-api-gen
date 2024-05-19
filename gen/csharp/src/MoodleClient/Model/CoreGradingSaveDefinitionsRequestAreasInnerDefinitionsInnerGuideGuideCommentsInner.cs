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
    /// CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner
    /// </summary>
    [DataContract(Name = "core_grading_save_definitions_request_areas_inner_definitions_inner_guide_guide_comments_inner")]
    public partial class CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner" /> class.
        /// </summary>
        /// <param name="description">description.</param>
        /// <param name="descriptionformat">description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN).</param>
        /// <param name="id">criterion id.</param>
        /// <param name="sortorder">sortorder.</param>
        public CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner(string description = default(string), int descriptionformat = default(int), int id = default(int), int sortorder = default(int))
        {
            this.Description = description;
            this.Descriptionformat = descriptionformat;
            this.Id = id;
            this.Sortorder = sortorder;
        }

        /// <summary>
        /// description
        /// </summary>
        /// <value>description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "descriptionformat", EmitDefaultValue = false)]
        public int Descriptionformat { get; set; }

        /// <summary>
        /// criterion id
        /// </summary>
        /// <value>criterion id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// sortorder
        /// </summary>
        /// <value>sortorder</value>
        [DataMember(Name = "sortorder", EmitDefaultValue = false)]
        public int Sortorder { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Descriptionformat: ").Append(Descriptionformat).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Sortorder: ").Append(Sortorder).Append("\n");
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
