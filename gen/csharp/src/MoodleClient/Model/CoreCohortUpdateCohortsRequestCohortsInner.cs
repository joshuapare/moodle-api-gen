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
    /// CoreCohortUpdateCohortsRequestCohortsInner
    /// </summary>
    [DataContract(Name = "core_cohort_update_cohorts_request_cohorts_inner")]
    public partial class CoreCohortUpdateCohortsRequestCohortsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCohortUpdateCohortsRequestCohortsInner" /> class.
        /// </summary>
        /// <param name="categorytype">categorytype.</param>
        /// <param name="customfields">customfields.</param>
        /// <param name="description">cohort description.</param>
        /// <param name="descriptionformat">description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to 1).</param>
        /// <param name="id">ID of the cohort.</param>
        /// <param name="idnumber">cohort idnumber.</param>
        /// <param name="name">cohort name.</param>
        /// <param name="theme">the cohort theme. The allowcohortthemes setting must be enabled on Moodle.</param>
        /// <param name="visible">cohort visible.</param>
        public CoreCohortUpdateCohortsRequestCohortsInner(CoreCohortUpdateCohortsRequestCohortsInnerCategorytype categorytype = default(CoreCohortUpdateCohortsRequestCohortsInnerCategorytype), List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> customfields = default(List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>), string description = default(string), int descriptionformat = 1, int id = default(int), string idnumber = default(string), string name = default(string), string theme = default(string), bool visible = default(bool))
        {
            this.Categorytype = categorytype;
            this.Customfields = customfields;
            this.Description = description;
            this.Descriptionformat = descriptionformat;
            this.Id = id;
            this.Idnumber = idnumber;
            this.Name = name;
            this.Theme = theme;
            this.Visible = visible;
        }

        /// <summary>
        /// Gets or Sets Categorytype
        /// </summary>
        [DataMember(Name = "categorytype", EmitDefaultValue = false)]
        public CoreCohortUpdateCohortsRequestCohortsInnerCategorytype Categorytype { get; set; }

        /// <summary>
        /// Gets or Sets Customfields
        /// </summary>
        [DataMember(Name = "customfields", EmitDefaultValue = false)]
        public List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> Customfields { get; set; }

        /// <summary>
        /// cohort description
        /// </summary>
        /// <value>cohort description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "descriptionformat", EmitDefaultValue = false)]
        public int Descriptionformat { get; set; }

        /// <summary>
        /// ID of the cohort
        /// </summary>
        /// <value>ID of the cohort</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// cohort idnumber
        /// </summary>
        /// <value>cohort idnumber</value>
        [DataMember(Name = "idnumber", EmitDefaultValue = false)]
        public string Idnumber { get; set; }

        /// <summary>
        /// cohort name
        /// </summary>
        /// <value>cohort name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// the cohort theme. The allowcohortthemes setting must be enabled on Moodle
        /// </summary>
        /// <value>the cohort theme. The allowcohortthemes setting must be enabled on Moodle</value>
        [DataMember(Name = "theme", EmitDefaultValue = false)]
        public string Theme { get; set; }

        /// <summary>
        /// cohort visible
        /// </summary>
        /// <value>cohort visible</value>
        [DataMember(Name = "visible", EmitDefaultValue = true)]
        public bool Visible { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCohortUpdateCohortsRequestCohortsInner {\n");
            sb.Append("  Categorytype: ").Append(Categorytype).Append("\n");
            sb.Append("  Customfields: ").Append(Customfields).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Descriptionformat: ").Append(Descriptionformat).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Idnumber: ").Append(Idnumber).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Theme: ").Append(Theme).Append("\n");
            sb.Append("  Visible: ").Append(Visible).Append("\n");
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
